# ppp-converter-libary

This android lib converts currencies in PPP terms

to install 
add this to project level gradel
// if nothing in project level ; look in settings.gradle

maven { url 'https://jitpack.io' }
in all repositories

afterwards
add this to module level gradle 

implementation 'com.github.thehealer15:ppp-converter-libary:0.1.0'

## fuctions 
double inrInPPP = Converter.getINR2USD(double ) 
double USDinPpP = Converter.getUSD2INR(double )
