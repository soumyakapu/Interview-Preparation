### 1. What is covariant return type ?
- It is introduced in java 5
- We can use the return type of override method and parent class method as same or  child of parent class return type
### 2.Inheritance vs Association vs Aggregation vs Composition
- Inheritance : acquiring the properties of parent class 
- it have a IS-A relationship
- ex: Cricket is a game
- Association : it has object inside the class
- it have a HAS-A relation
- it is divided into Aggregation and composition
- Aggregation : it is one-way relation 
- Mobile has a fingerprint it is  not mandatory to have  fingerprint
- Composition : It is two-way relation
- Mobile has a battery
### 3.  Different ways of creating an object.
- using new keyword
```
Hello hello =new Hello();
```
- using clone method it will create a copy of exiting object
``` 
Hello hello = new Hello();
Hello hello1 = hello.clone();
```
- using Class.ForName it will load the class
``` 
MyClass myclass = Class.ForName("MyClass").newInstance();
```
- using deserialization 
```
ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
MyClass obj = (MyClass)in.readObject();

```
### 4. SOLID principles
-   Solid principles was introduced by Martin C Robert
- S : Single responsible 
- O : open for extension and closed for modification
- L :Liskove substutions
- I : interface segration
- D : dependency inversion
### 5. ACID principles
### 6. Fail fast, fail safe iterators
### 7. How internally fail-fast checks and throw ConcurrentModificationException?
### 8, 9. Memory in java
### 10. How to get the size of the java object ?
### 11. Object Serialization with inheritance in java
### 12. There are three statements in a try block - statement1, statement2 and statement3, After that there is a catch block to catch the exceptions occurred in the try block. Assume that exception has occurred in statement2. Does statement3 get executed or not ?
### 13. What is unreachable catch block error ?
### 14. What is the difference between ClassNotFoundException and NoClassDefFoundError in java ?
### 15. Custom immutable class
### 16. Why java 8 is more popular than java 9 and other versions?
### 17. Interface and why it is? Why interfaces widely used than abstract classes?
### 18. Is Functional interface there before java8? What are they ?
### 19. Custom functional interface creation
### 20. Other than public what ar the access modifier for interface
### 21. Timed out exception
### 22. TreeMap?
### 23. Where we are LinkedHashMap?
### 24. SQL injection
### 25. How we know a thread is completed ?
### 26. How we execute multiple methods parallel and aggregate?
### 27. HashSet of employees bases on name, how we can get unique employees based on email id.
### 28. How do you scale your application?
### 29. Transaction propagation
### 30. Transactional isolation
### 31. String Builder vs String Buffer
### 32. @Service vs @Repository, Is spring container throws any exception while using @Repository in Service interface
### 33. Service interface
### 34. Spring AOP
### 35. How we use cross-cutting concerns
### 36. Interceptor and filters
### 37. Composite key in jpa
### 38. Fetch - early fetch, lazy fetch
### 39. Stupid bean in java
### 40. Comparable() vs comparator()
### 41. To avoid clone() - (Implement Cloneable interface and override clone() and throw cloneNotSupported)
### 42. Merge vs pull
### 43. Git conflicts resolve
### 44. Git rollback
### 45. Virtualization or containerization
### 46. Character occurrence using HashMap, put() method returns ? - initially it returns null, later it returns previous value(V)
### 47. How many tables will create in one-to-many and many-to-many hibernate
### 48. Spring actuator
### 49. Spring mvc flow
### 50. Spring jpa
### 51. Get() vs load()
### 52. Hibernate caches and configuration for second level cache
### 53. Spring vs spring boot
### 54. Print middle number in given 3 numbers
### 55. == and .equals()
### 56. Object class
### 57. Second max highest salary in employee table
### 58. Why ArrayList is fast
### 59. List vs Set
### 60. Compare vs compareTo
### 61. Fork in git.
### 61. TreeMap/TreeSet internal working
### 62. Handling Cache in spring boot
### 63. String - intern() method
### 64. Context-path vs request-path
### 65. String internal working
### 66. Try with resources.
### 67. Spring profiles
### 68. Serialization vs deserialization - implementation
### 69. Serialization and it's child classes need to be serialized or not ?
### 70. Diamond problem
### 71. Volatile keyword-not required to serialization
### 72. Fork in java
### 73. Marker interface
### 74. Thread-safe, non-thread-safe
### 75. Bean ambiguity -@Primary
### 76. JWT - to rest endpoints secure. Spring security.
### 77. Spring boot - default servers-tomcat, undertow, jetty
### 78. Exception handling in spring boot
### 79. wait(), notify() and notifyAll() are methods in Object class
### 80. Custom annotations
### 81. how to exclude multiple dependencies in maven?
### 82. default Log4j level
### 83. HashMap, HashSet internal working
### 84. What is Optional
### 85. Optional chaining
### 86. Handling null pointers using Optional class
### 87. Functional interface, lambda, streams.
### 88. Map, filter, grouping by
### 89. Map vs flat map
### 90. Sorting
### 91. Method reference - can we call static / noo-static methods ?
### 92. List of employees group by designation and sorting.
### 93. Segment locking or bucket locking
### 94. ArrayList vs CopyOnWriteArrayList
### 95. Difference between Session get() and load() method?
### 96. Mapping in Hibernate
### 97. Composite Primary keys in JPA
### 98. Find second-highest salary of an employee?
### 99. Spring boot annotations
### 100. How annotation works in java?
### 101. Transaction rollback
### 102. Spring boot Actuator
### 103. @Controller vs @RestController
### 104. findById() and getOne()
### 105. Current projects and tech stack
### 106. How will you design the microservices based on the MVC pattern?
### 107. How will you implement a global exception handling
### 109. How annotations work behind the scene technically?
110. How to handle request parameter validation in SpringBoot?
111. How to write custom validation annotations?
112. What is transaction in an application, and why do we need transactions?
113. Explain how security tokens
114. How will you handle storing of sensitive data like password
115. How is a NoSql database different from an RDBMS?
116. What is generics in java? Can you explain with an example?
117. Explain the concepts related to lambda expressions?
118. Differentiate between List and Set in Java.
119. Java program to find Second-Highest Element in an array
120. Count strings whose length is greater than 3 in List using streams
121. Find duplicate elements in a given integers list in java using stream functions
122. Find the first element of the list using the stream functions
123. Find the first non-repeated character in it using Stream functions
124. Find out all the numbers starting with 1 using stream functions
125. Find repeated char using stream
126. Iterate a stream using the forEach method
127. remove the duplicate element from the list
128. sort the given list in ascending and descending order
129. get the sum of all numbers present in a list using streams
130. Filtering location: [[Pune, Hyd], [Chennai, Hyd], [Chennai, Hyd, Pune]] get unique cities from employee Object as [Hyd, Chennai, Pune] using flatMap
131. Unique array elements using streams
132. Character occurrence in a string using stream
133. Count of words or letters in a string using streams
134. HashMap sort based on value using streams: [fifteen=15, eleven=11, eight=8, one=1]
135. Sort of employee by salary using streams
136. Separate vowels and consonants in string using filter