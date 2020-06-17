# 1. Can you implement the sing() method for the bird?

## Solution Details

Method <code>sing()</code> is implemented in the bird class
###How did you unit test it?
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
Rooster is differentiated from Chicken based on the gender.Refer to <code>gender()<code>
Unit test is performed to test the results for the expected vs actuals.

# 4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.

## Solution Details

3 new classes are created for this requirement.Refer to <Class>Cat,<Class>Dog,<Class>Parrot.
Created a one-arg constructor which takes Animal as Argument, where we can pass different types of animals to this constructor
Refer <code>sound()<code> in <Class>Parrot
Unit test is performed to test the results for the expected vs actuals.
