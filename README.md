# Property Based Testing Examples (Junit-Quickcheck)

This repo hosts some examples on how to do Property Based Testing with [Junit-Quickcheck](http://pholser.github.io/junit-quickcheck/site/0.8.2/) in `Java`

## Examples

1. `MathOps`: simple implementation of mathematical functions. The Property Based Tests will check for associativity, commutativity and identity of sum and product
2. `EmployeeSerializer`: a simple serializer that can transform an `Employee` instance to an Array of bytes. The Property Based Tests check that the conversion can be done in both directions, for any instance of `Employee`.

## Running

This project uses `Maven`. To run the tests, from a shell environment: 

`mvn test`

The `EmployeeSerializer` property based test will print out random `Employee` instances used in that test. 

## Resources

### What properties to choose
https://fsharpforfunandprofit.com/posts/property-based-testing-2/

### Property Based Testing Step by Step 
https://www.leadingagile.com/2018/04/step-by-step-toward-property-based-testing/
