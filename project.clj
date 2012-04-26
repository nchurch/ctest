(defproject ctest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :cljsbuild {
              :builds [{:source-path "src/client"
                        :compiler {:output-to "resources/public/js/main.js"}
                        :optimizations :whitespace
                        :pretty-print true}]
              :repl-listen-port 9000})
