@echo off
:: Fetch param1
set "param1=%~1"
if "%param1%"=="" goto :run
if "%param1%"=="br" goto :build
if "%param1%"=="b" goto :buildnotrun
set /p var=<toggle.int
:build
.\gradlew build

:run
if "%var%" == "0" goto :runc
if "%var%" == "1" goto :skip
:runc
.\gradlew runClient
echo 1>toggle.int
:buildnotrun
.\b build
:skip
@echo on
echo 0>toggle.int