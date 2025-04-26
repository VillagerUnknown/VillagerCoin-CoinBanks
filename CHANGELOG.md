# Changelog

All notable changes to this project will be documented in this file.

## [1.0.1]

### Changed

- Changed extending class for `CoinBankBlockEntity` to `AbstractCollectionValueBlockEntity`. 
This is a minor update to comply with changes from Villager Coin that improves flexibility when creating Block Entities with a Collection component and value.
- Changed Coin Banks to be waterloggable. If waterlogged, They also now produce bubbles, instead of dust plumes, while adding coins. 
_Players with existing coin banks might find their coin banks submerged in water after updating. 
It is advised to break them with a silk touch before updating and placing them back down after updating._

## [1.0.0]

_Initial release for Minecraft 1.21.1_