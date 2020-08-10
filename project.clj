(defproject seancorfield/hello-compojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring "1.8.1"]
                 ;[ring/ring-jetty-adapter "1.8.1"]
                 [ring/ring-defaults "0.3.2"]]
  :main seancorfield.hello-compojure.handler
  :ring {:handler seancorfield.hello-compojure.handler/app}
  :profiles
  {:dev {:dependencies [[ring/ring-mock "0.3.2"]]}})
