# Local Map Adventure (Simplified)

A minimal Android app that shows a few sample locations as markers on a Google Map.
Users are instructed to visit the locations and create a post on social media (Instagram).

## What’s included

- 5 locations in San Marcos, TX, chosen from a list of 115.
- Google Map (Jetpack Compose + maps-compose).
- Tapping a marker shows a simple info card at the bottom.

## How to run

1. Open the `LocalMapAdventure` folder in **Android Studio**.
2. Sync Gradle and run on an emulator or device (Google Play services required).

## Project structure

```
app/src/main/java/com/example/localmapadventure/
├── MainActivity.kt
├── data/
│   └── SampleLocations.kt      ← edit locations here
└── ui/
    ├── MapScreen.kt            ← the map + markers
    └── theme/
        └── Theme.kt
```


