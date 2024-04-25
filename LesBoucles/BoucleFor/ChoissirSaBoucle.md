# Le choix de la boucle la plus adaptée

Vous avez maintenant trois boucles à votre disposition pour écrire vos algorithmes. Une question légitime à se poser est de savoir dans quelles situations préférer l'une plutôt que l'autre. Pour répondre à cette question, je vous invite à vous poser deux questions:

### Avant de commencer la boucle, le nombre d'itérations est-il connu ?

- Si oui, alors la boucle la plus adaptée est la boucle FOR
- si non, alors il est nécessaire de se poser une nouvelle question:

### est-il possible de ne réaliser aucune itération de cette boucle ?

- Si oui, alors la boucle la plus adaptée est la boucle TantQue
- Si non, alors il faut préferer une boucle Répéter

Ces régles constituent des bonnes pratiques. Il est tout à fait possibles de ne pas les respecter: par exemple, il est tout à fait possible de réaliser une boucle dont le nombre d'itérations est connu avant son début à laide d'une boucle TantQue ou d'une boucle Répéter ! Néanmoins, votre code sera moins facile à comprendre, donc plus difficile à maintenir et à optimiser.

En java, il existe des mots-clefs permettant de sortir de manière anticipée d'une boucle (break) ou de ne pas terminer l'itération en cours (continue). Il est toujours possible de se passer de ces instructions en choissisant la bonne boucle et en écrivant la bonne condition pour celle-ci. Il est préférable de ne pas avoir recours à ces mots-clefs, qui cassent le déroulement normal de la boucle et rendent également le code plus difficile à lire et à optimiser.
