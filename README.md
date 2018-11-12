# Santa Strings

[![Build Status](https://travis-ci.org/en-dev/cik-java-santa-strings.svg?branch=master)](https://travis-ci.org/en-dev/cik-java-santa-strings)

Santa wants to separate good strings from bad ones. 

## Part one
Tomten behöver hjälp med att lista ut vilka strängar i hans textfil som är snälla eller dumma.

En snäll sträng är en som har följande egenskaper:

Den har åtminstone 3 vokaler (endast aeiou), t.ex. aei, xazegov eller aeiouaeiouaeiou
Den har åtminstone en bokstav som förekommer två gånger i rad, t.ex. xx, abcdde (dd) eller aabbccdd (aa, bb, cc eller dd)
Den har INTE någon av strängarna ab, cd, pq eller xy, även om de är del av de andra kraven

Exempelvis:
ugknbfddgicrmopn är snäll eftersom den har tre vokaler (u…i…o), en dubbelbokstav (…dd…) och ingen av de otillåtna substrängarna
aaa är snäll eftersom den har tre vokaler och en dubbelbokstav, även om de reglerna överlappar
jchzalrnumimnmhp är dum eftersom den inte har någon dubbel bokstav
haegwjzuvuyypxyu är dum eftersom den har substrängen xy
dvszwmarrgswjxmb är dum eftersom den bara har en vokal

Hur många strängar är snälla?

## Part two 
Tomten inser att han har gjort fel och byter till en bättre modell för att avgöra om strängar är snälla eller dumma. Ingen av de gamla reglerna gäller, eftersom de alla är uppenbart löjliga.

Nu gäller istället dessa egenskaper för en snäll sträng:

* Den har ett par av bokstäver som dyker upp på minst två ställen i strängen utan att överlappa, som xyxy (xy) eller aabcdefgaa (aa), men inte som aaa (aa, men den överlappar).

* Den har minst en bokstav som upprepas med en bokstav mellan dem, som xyx, abcdefeghi (efe) eller aaa.

Till exempel:

* qjhvhtzxzqqjkmpb är snäll eftersom den har ett par som dyker upp två gånger (qj) och har en bokstav som upprepas med exakt en bokstav mellan dem (zxz).

* xxyxx är snäll eftersom den har ett par som dyker upp två gånger och en bokstav som upprepar med en mellan, även om bokstäverna som används av båda reglerna överlappar.

* uurcxstgmygtbstg är dum eftersom den har ett par (tg) men ingen upprepning med en ensam bokstav mellan dem.

* ieodomkazucvgmuy är dum eftersom den har en upprepande bokstav med en mellan (odo), men inget par som dyker upp två gånger.

Hur många strängar är snälla under dessa nya regler?