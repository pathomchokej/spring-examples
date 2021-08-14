kill -9 $(lsof -i:8080 -t) 2> /dev/null
kill -9 $(lsof -i:1099 -t) 2> /dev/null