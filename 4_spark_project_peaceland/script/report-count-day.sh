#!/bin/bash

echo "Report count in $1: "$(grep -r "$1" | wc -l)
