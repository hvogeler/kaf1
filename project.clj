(defproject kaf1 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
		 [org.clojure/core.async "1.3.610"]
     [org.clojure/tools.logging "1.1.0"]
     [org.slf4j/slf4j-log4j12 "1.6.2"]
[log4j "1.2.16"]
[org.apache.logging.log4j/log4j-api "2.8.2"]
[org.apache.logging.log4j/log4j-core "2.8.2"]
[proto-repl "0.3.1"]
[proto-repl-charts "0.3.2"]]
  :main ^:skip-aot kaf1.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"
                                  "-Dclojure.tools.logging.factory=clojure.tools.logging.impl/slf4j-factory"]}})
