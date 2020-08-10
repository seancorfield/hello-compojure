# hello-compojure

Use `lein repl` to start a REPL.

In the REPL, use `(jetty/run-jetty app {:port 3000 :join? false})` to start a server to work with.

Use `lein run` to run the application (without starting a REPL).

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## License

Copyright © 2020 FIXME
