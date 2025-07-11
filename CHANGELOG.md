# Changelog

All notable changes to this project will be documented in this file.

## [1.0.5]

### Added

- Added `villager_coin` item tag.
- Added translations for German, Pirate English, Brazil Portuguese, Spanish, Hindi, Italian, Swedish, French, Korean, Japanese, Russian, Simplified Chinese, and Hebrew.

## [1.0.4]

### Added

- Added Pufferfish Coin Bank.
- Added Slime Coin Bank.
- Added Magma Cube Coin Bank.
- Added Hoglin and Zoglin Coin Banks. _These banks are loved by Piglins._

### Changed

- Changed supported Platform version to 1.3.0.
- Changed supported Villager Coin version to 1.0.8.

## [1.0.3]

Receiving updates from VC 1.0.7.

### Changed

- Changed block and item tags to comply with updates from VC 1.0.7.
- Changed component location references for imports to comply with updates from VC 1.0.7.

## [1.0.2]

### Added

- Added Copper, Amethyst, Iron, Gold, Diamond, and Emerald Coin Banks.
- Added fireproof, and blast resistant, Netherite Coin Bank.
- Added 2 blast resistant Coin Banks: Obsidian and Crying Obsidian.
- Added 16 colors of Sheep Coin Banks.
- Added 3 types of Cow Coin Banks: Cow, Red Mooshroom, and Brown Mooshroom.
- Added 2 types of Bee Coin Banks: Bee and Angry Bee.
- Added 2 types of Guardian Coin Banks: Guardian and Elder Guardian.
- Added Ravager Coin Bank.
- Added Recipe Advancements for Coin Banks.

### Changed

- Changed mixin filenames to avoid potential conflicts.

## [1.0.1]

### Added

- Added Piglin and Zombified Piglin Coin Banks.

### Changed

- Changed extending class for `CoinBankBlockEntity` to `AbstractCollectionValueBlockEntity`. 
This is a minor update to comply with changes from Villager Coin that improves flexibility when creating Block Entities with a Collection component and value.
- Coin Banks can now accept coins from hoppers pointed down and directly above them. Hoppers will not pull coins from Coin Banks.
- Changed Coin Banks to be waterloggable. If waterlogged, They also now produce bubbles, instead of dust plumes, while adding coins. 
_Players with existing coin banks might find their coin banks submerged in water after updating. 
It is advised to break them with a silk touch before updating and placing them back down after updating to avoid any water damage._

## [1.0.0]

_Initial release for Minecraft 1.21.1_