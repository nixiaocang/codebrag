#!/bin/bash

./node_modules/.bin/forever start -o out.log -e err.log -m 10 lib/server.js