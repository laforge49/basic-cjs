(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :repositories
  [["clojars" {:url "https://repo.clojars.org/"}]
   ["maven-central" {:url "https://repo1.maven.org/maven2"}]]
  :dependencies
  [[adzerk/boot-cljs "1.7.228-2"]
   [onetom/boot-lein-generate "0.1.3" :scope "test"]]
  :source-paths
  ["src/cljs"]
  :resource-paths
  ["resources"])