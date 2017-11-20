(ns koans.02-strings
  (:require [koan-engine.core :refer :all]
            [clojure.string :as string]))

(meditations
  "A string is nothing more than text surrounded by double quotes"
  (= __ "hello")

  "You can do more than create strings, you can put them together"
  (= "Cool right?" (str __ __))

  "You can even count the characters"
  (= __ (count "Hello World"))

  "What if you only wanted to get part of a string?"
  (= "World" (subs "Hello World" __ __))

  "How about joining together elements in a vector?"
  (= __ (string/join [1 2 3]))

  "What if you wanted to separate them out?"
  (= "1, 2, 3" (string/join __ [1 2 3]))

  "Maybe you want to separate out all your lines"
  (= [__ __ __] (string/split-lines "1\n2\n3"))

  "You may want to make sure your words are backwards"
  (= __ (string/reverse "hello"))

  "Maybe you want to find the index of the first occurrence of a substring"
  (= 0 (string/index-of "hello world" __))

  "Or maybe the last index of the same"
  (= __ (string/last-index-of "hello world, hello" "hello"))

  "But when something doesn't exist, nothing is found"
  (= __ (string/index-of "hello world" "bob"))

  "Sometimes you don't want whitespace cluttering the front and back"
  (= __ (string/trim "  \nhello world \t \n"))

  "Strings are strings"
  (= true (string? __))

  "Some strings may be blank"
  (= __ (string/blank? ""))

  "Even if at first glance they aren't"
  (= __ (string/blank? " \n \t  "))

  "However, most strings aren't blank"
  (= __ (string/blank? "hello?\nare you out there?")))
