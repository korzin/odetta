#!/usr/bin/env bash
echo "prepare_db -- begin"
mongo odettadb params.js init-collections.js