# Mes Députés

Application Android permettant de consulter facilement les informations relatives aux députés et d'explorer leurs collaborateurs ainsi que leurs responsabilités.

L'application propose une interface simple pour parcourir les députés, effectuer une recherche par ville et consulter le profil détaillé d'un député.

## Fonctionnalités

- Affichage de l'écran d'accueil.
- Recherche de députés par ville.
- Consultation du profil détaillé d'un député.
- Affichage des collaborateurs associés à un député.
- Affichage des responsabilités exercées.
- Récupération des données depuis des endpoints distants.
- Interface Android basée sur les composants AndroidX et Material Design.

## Aperçu de l'application

### Écran d'accueil

![Écran d'accueil](https://github.com/hichemmezemate/mesdeputes/assets/78790205/ba025cea-7b04-4489-ac9b-40ab0a6b3c9e)

### Recherche par ville

![Recherche par ville](https://github.com/hichemmezemate/mesdeputes/assets/78790205/b684ddde-b5f7-4c9a-8a95-9ef2060c32cc)

### Profil d'un député

![Profil d'un député](https://github.com/hichemmezemate/mesdeputes/assets/78790205/080dbf0c-a0ce-40a2-ada2-f72898f2af34)

## Technologies utilisées

- **Kotlin/Java Android** — développement de l'application mobile
- **Android SDK 34**
- **AndroidX AppCompat** — compatibilité et composants Android
- **Material Design** — composants et interface utilisateur
- **ConstraintLayout** — conception des interfaces
- **Volley** — appels réseau HTTP
- **Gson** — sérialisation et désérialisation des données JSON
- **Gradle** — gestion de la compilation et des dépendances

## Prérequis

Avant de lancer le projet, assurez-vous d'avoir installé :

- Android Studio récent
- Android SDK avec la plateforme **API 34**
- JDK 8 ou version compatible avec votre installation Android Studio
- Un appareil Android ou un émulateur avec Android 11 / API 30 minimum

## Installation

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/hichemmezemate/mesdeputes.git
   ```

2. Ouvrez le dossier `mesdeputes` dans Android Studio.

3. Attendez la synchronisation de Gradle.

4. Lancez l'application sur un appareil ou un émulateur Android.

Vous pouvez également compiler et installer l'application depuis le terminal :

```bash
./gradlew assembleDebug
./gradlew installDebug
```

Sous Windows, utilisez `gradlew.bat` à la place de `./gradlew`.

## Structure du projet

```text
mesdeputes/
├── app/
│   └── src/
│       └── main/
│           ├── java/       # Code source de l'application
│           ├── res/        # Layouts, images, chaînes et ressources
│           └── AndroidManifest.xml
├── build.gradle            # Configuration Gradle principale
├── settings.gradle         # Configuration des modules
└── README.md
```

## Données et API

L'application s'appuie sur des endpoints dédiés aux **collaborateurs** et aux **responsabilités** des députés. Les données sont récupérées au format JSON, puis converties en objets utilisables dans l'application grâce à Gson.

Les appels réseau sont effectués avec Volley. Une connexion Internet est donc nécessaire pour charger les informations depuis l'API.

## Tests

Pour exécuter les tests unitaires :

```bash
./gradlew test
```

Pour exécuter les tests instrumentés sur un appareil ou un émulateur :

```bash
./gradlew connectedAndroidTest
```

## Version

- Version actuelle : `1.0`
- `minSdk` : `30`
- `targetSdk` : `34`
- `compileSdk` : `34`

## Contribution

Les contributions sont les bienvenues ! Pour proposer une amélioration :

1. Forkez le projet.
2. Créez une branche dédiée :

   ```bash
   git checkout -b feature/ma-fonctionnalite
   ```

3. Effectuez vos modifications.
4. Vérifiez que le projet compile et que les tests passent.
5. Ouvrez une Pull Request en décrivant clairement vos changements.

## Licence

Aucune licence n'est actuellement spécifiée pour ce projet. Si vous souhaitez réutiliser ou distribuer le code, contactez l'auteur afin de clarifier les conditions d'utilisation.

## 👤 Auteur

Développé par [Hichem Mezemate](https://github.com/hichemmezemate).
