(defproject hanging-spandex-problem "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [cc.qbits/spandex "0.6.2"]]
  :main ^:skip-aot hanging-spandex-problem.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[org.clojure/test.check "0.9.0"]
                                  [midje "1.9.1"]]
                   :plugins [[lein-midje "3.2.1"]]}})
