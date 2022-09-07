package javaIO.StrategyDecorator;

/**
 * Ce pattern de conception permet d'ajouter des fonctionnalités à un objet sans avoir à modifier son code source.
 * Afin de ne pas trop vous embrouiller avec les objets étudiés dans ce chapitre, je vais vous fournir un autre exemple,
 * plus simple, mais gardez bien en tête que les objets du packagejava.ioutilisent ce pattern.
 * Le but du jeu est d'obtenir un objet auquel nous pourrons ajouter des choses afin de le « décorer »…
 * Vous allez travailler avec un objetGateauqui héritera d'une classe abstraitePatisserie.
 * Le but du jeu est de pouvoir ajouter des couches à notre gâteau sans avoir à modifier son code source.
 */
public abstract class Patisserie {
    public abstract String preparer();
}
