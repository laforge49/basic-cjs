;                  [adzerk/boot-cljs "2.1.5" :scope "test"]

(set-env!
 :source-paths #{"src/cljs"}
 :resource-paths #{"resources"}

 :dependencies '[[adzerk/boot-cljs "2.1.5"]
                 [pandeiro/boot-http "0.8.3"]
                 [onetom/boot-lein-generate "0.1.3" :scope "test"]
                 [adzerk/boot-reload "0.6.0"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[pandeiro.boot-http :refer [serve]]
         '[adzerk.boot-reload :refer [reload]]
         'boot.lein)

(deftask generate []
  (comp
    (boot.lein/generate)))

(deftask dev []
  (comp
   (serve :dir "target")
   (watch)
   (reload)
   (cljs)
   (target :dir #{"target"})))
