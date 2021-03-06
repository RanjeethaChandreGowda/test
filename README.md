# 1. Can you implement the sing() method for the bird?

## Solution Details

Method <code>sing()</code> is implemented in the bird class

### How did you unit test it?

Refer to <code>TestSolution</code> unit class
The methods inside the Animal and Bird class has void methods, writing unit test on void methods only help to test the behaviour. In the problem statement example given, it only had a sys out statement. So I had modified the methods to return the value based on the operation, so we can create assertions to test the expected vs actuals.

# 2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?

## Solution Details

2 new Classes are created namely Chicken,Duck. Refer to <Class>Chicken, <Class>Duck.
Created abstract method sound() in Bird class.
The sound() method is implemented in Duck and Chicken class to distinguish their behaviour based on the sound.
Unit testing is performed to test for the expected vs actuals.

# 3. Now how would you model a rooster?

## Solution Details

Rooster class is created. Refer to <Class>Rooster.
Composition is implemented to invoke the methods of Class<Chicken>.(Note: According to the problem statement Inheritance should not be used to access <Class>Chicken)
Rooster is differentiated from Chicken based on the gender.Refer to <code>gender()</code>
Unit test is performed to test the results for the expected vs actuals.

# 4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.

## Solution Details

3 new classes are created for this requirement.Refer to <Class>Cat,<Class>Dog,<Class>Parrot.
Created a one-arg constructor which takes Animal as Argument, where we can pass different types of animals to this constructor
Refer <code>sound()</code> in <Class>Parrot
Unit test is performed to test the results for the expected vs actuals.

# Section-B

# 1. In addition to the birds, can you model a fish?

## Solution Details

Created <Class>Fish.
Refer <code>walk(),sound(),swim()</code> of <Class>Fish
Unit test is performed to verify the results.

# 2. Can you specialize the fish as a Shark and as a Clownfish?

## Solution Details

Created <Class>ClownFish,<Class>Shark.
<Class>ClownFish defines it’s behaviour. Refer <code>size(),color(),behaviour() </code>
<Class>Shark defines it’s behaviour. Refer <code>size(),color(),behaviour()</code>
Unit test is performed to test the results for the expected vs actuals.

# 3. Dolphins are not exactly fish, yet, they are good swimmers

## Solution Details

Created <Class>Dolphin.
Composition is implemented to invoke the methods of Class<Fish>.
Unit test is performed to verify the results of expected vs actual

# Section-D

# 1. Can you model a butterfly?

## SolutionDetails

Created abstract class Class<Insect> with abstract method <code>fly()</code>
Created Class<ButterFly>. Refer to <code>fly(),sound()</code>
Unit test performed to verify the results of expected vs actual

# 2. Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?

## SolutionDetails

Created abstract class Class<Insect> with abstract method <code>fly()</code>
Created Class<Caterpillar>. Refer to <code>fly(),walk()</code>
Unit test performed to verify the results of expected vs actual

# Section-E Counting Animals

# 1. Can you share the code to count:

a. how many of these animals can fly?
b. how many of these animals can walk?
c. how many of these animals can sing?
d. how many of these animals can swim?

## SolutionDetails

Test class is created to get the count of number of animals which can fly,walk,sing,swim.
<Class>TestCountAnimals and Refer <code>test()</code>
Loggers are used to log the count info of animals.

# Bonus-Section

# 1. Can you add a second language (if you know a language other than English) Use the rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds differently depending on language. Please add the rooster sound in your native tongue.

## SolutionDetails

Necessary configuration is done to enable ResourceBundle
Created separate property files for different languages

# 2. Can you design a RESTful API for querying these animals?

## SolutionDetails

Implemented an API to list all the animals matching the criteria that can fly,walk,swim.
Refer the sample request
<code>{
"walk":true,
"fly":true,
"swim":true
}</code>
