### Journal Prompt: Explain why you chose specific access modifiers (private, protected, or public) for your attributes and methods. How does this choice protect the “state” of your object from accidental or malicious changes? 

I decided to store the two instance variables I created as private so they could not be changed outside the class but allowed for them to 
be accessed through public getter and setter methods. The getter and setter methods are accessible outside the class but not changeable. 
This allows me to make them public without the danger of them being changed when they are called to be used. The tostring method just calls
the values inside a variable and prints it out where it is written so there is no danger of information inside the class being changed when it is set as public.