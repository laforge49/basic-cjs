(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :repositories
  [["clojars" {:url "https://clojars.org/repo/"}]
   ["maven-central" {:url "https://repo1.maven.org/maven2"}]]
  :dependencies
  [[org.clojure/clojure "1.10.1" :scope "provided"]
   [org.clojure/clojurescript "1.10.520"]
   [adzerk/boot-cljs "2.1.5" :scope "test"]
   [onetom/boot-lein-generate "0.1.3" :scope "test"]]
  :source-paths
  ["src"]
  :resource-paths
  ["resources"])