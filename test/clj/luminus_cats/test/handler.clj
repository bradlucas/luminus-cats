(ns luminus-cats.test.handler
  (:require [clojure.test :refer :all]
            [ring.mock.request :refer :all]
            [luminus-cats.handler :refer :all]
            [luminus-cats.middleware.formats :as formats]
            [muuntaja.core :as m]
            [mount.core :as mount]))

(defn parse-json [body]
  (m/decode formats/instance "application/json" body))

(use-fixtures
  :once
  (fn [f]
    (mount/start #'luminus-cats.config/env
                 #'luminus-cats.handler/app)
    (f)))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= 200 (:status response)))))

  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= 404 (:status response))))))
