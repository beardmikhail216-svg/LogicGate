# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## Added

- Designed a LogicGate component
- Created LogicGateKernel by referencing NaturalNumberKernel
- Created LogicGate by referencing NaturalNumber and Queue
- Began LogicGateSecondary
- Began LogicGate1L by referencing NaturalNumber1L and Queue1L

## [2026.11.09]

## Altered

- renamed component file to components

## [2026.11.10]

## Updated

- added single input setInput method for NOT gate, and updated method headers for all existing methods in kernel interface.
- rearranged methods contains in LogicGate and LogicGateKernel to help implementation of toString, equals, and hashcode.
- finished methods for abstract and secondary. working on resolving issues with handling gate inputs (NOT only accepts one input whereas all other gates are hard coded to be two input--though more inputs are possible in actual gates)

## [2026.11.13]
