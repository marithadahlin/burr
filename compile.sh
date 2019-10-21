#!/bin/bash -ex

javac src/burr/*.java
javac -cp src/:testng-6.8/testng-6.8.jar test/*.java
