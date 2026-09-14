# Local Map Adventure (Simplified)

A minimal Android app that shows a few sample local businesses as markers on a Google Map.

## What’s included

- 6 hard-coded sample locations in San Francisco
- Google Map (Jetpack Compose + maps-compose)
- Tapping a marker shows a simple info card at the bottom

## How to run

1. Open the `LocalMapAdventure` folder in **Android Studio**.
2. Get a free Google Maps API key:
   - Go to [Google Cloud Console](https://console.cloud.google.com/)
   - Create a project → enable **Maps SDK for Android**
   - Create an API key
3. Paste the key in `app/build.gradle.kts`:
   ```kotlin
   manifestPlaceholders["MAPS_API_KEY"] = "YOUR_REAL_KEY_HERE"
   ```
4. Sync Gradle and run on an emulator or device (Google Play services required).

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

## Next steps (when you want more)

- Add real location permission + “my location” button
- Load businesses from a JSON file or API
- Add categories / filtering
- Turn it into an adventure with check-ins

That’s it — keep it simple.
