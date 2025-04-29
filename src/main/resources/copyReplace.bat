@echo off
setlocal enabledelayedexpansion

:: Check if required parameters are provided
if "%~2"=="" (
    echo Usage: %0 oldText newText
    echo Example: %0 oldText newText
    exit /b 1
)

:: Get the oldText and newText from the command line arguments
set "oldText=%~1"
set "newText=%~2"

:: Get the current directory
set "currentDir=%cd%"

:: Recursively search for files containing oldText in the filename and perform replacement
for /r "%currentDir%" %%F in (*%oldText%*) do (
    set "sourceFile=%%F"
    set "sourceDir=%%~dpF"
    set "fileName=%%~nxF"
    set "newFileName=!fileName:%oldText%=%newText%!"

    :: Check if the filename contains the oldText and needs to be renamed
    if /i not "!fileName!"=="!newFileName!" (
        :: Copy the file with the new filename
        copy "!sourceFile!" "!sourceDir!!newFileName!" >nul

        :: Perform find and replace in the copied file
        (
            for /f "usebackq delims=" %%A in ("!sourceDir!!newFileName!") do (
                set "line=%%A"
                set "line=!line:%oldText%=%newText%!"
                echo !line!
            )
        ) > "!sourceDir!!newFileName!.tmp"

        :: Replace the original copied file with the modified one
        move /y "!sourceDir!!newFileName!.tmp" "!sourceDir!!newFileName!"
    )
)

echo Find and replace completed for all files.
exit
