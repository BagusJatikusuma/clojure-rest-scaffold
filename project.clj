(defproject clojure-rest-scaffold "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojure "1.10.0"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [luminus/ring-undertow-adapter "1.2.9"]
                 [metosin/reitit "0.5.18"]
                 [camel-snake-kebab "0.4.1"]
                 [crypto-password "0.3.0"]
                 [com.github.seancorfield/next.jdbc "1.3.847"]
                 [com.github.seancorfield/honeysql "2.4.947"]
                 [mysql/mysql-connector-java "8.0.31"]
                 [http-kit "2.3.0"]
                 [org.clojure/data.json "2.4.0"]
                 [clojure.java-time "1.1.0"]
                 [clj-http "3.12.3"]
                 [buddy/buddy-core "1.7.1"]]
  :main ^:skip-aot clojure-rest-scaffold.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
