(set-env!
  :source-paths #{"src"}
  :resource-paths #{"resources"}
  :dependencies '[[org.clojure/clojure "1.10.1" :scope "provided"]
                  [org.clojure/clojurescript "1.10.520"]
                  [adzerk/boot-cljs "2.1.5" :scope "test"]
				  [onetom/boot-lein-generate "0.1.3" :scope "test"]])

(require '[adzerk.boot-cljs      :refer :all]
		 'boot.lein)

(deftask dev []
  (comp
    (boot.lein/generate)
    #_(cljs :optimizations :none)))
	