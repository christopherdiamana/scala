#!/bin/bash

n=0
m=0
for f in $(find -name "part*"); do
    for i in $(cat $f | sed -n "s/.*peacescore\":\([0-9]*\).*/\1/p"); do
        n=$((n+i))
        m=$((m+1))
    done
done

echo "Average PeaceScore: "$(bc -l <<< "$n/$m")
