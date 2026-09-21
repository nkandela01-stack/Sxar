# SXAR App v1

This package consolidates the SXAR prototypes into one installable web app/PWA and prepares the project for native Android/iPhone packaging.

## Included
- SXAR dark/neon interface
- Home, Search, Premium, Radio, Library, Profile
- Artist Dashboard
- Local audio upload and playback
- Cover artwork
- Lyrics
- Play counts
- Favorites
- Radio directory/search
- Direct radio playback where a stream is available
- Supabase schema/configuration starter
- PWA manifest + service worker + install button
- Capacitor configuration for Android/iOS

## Run the web app
Serve this folder from a local web server (for example VS Code Live Server or `python -m http.server`) and open it in a browser.

## Turn it into Android/iPhone apps
Install Node/npm and then:
1. `npm install`
2. `npx cap add android`
3. `npx cap add ios`
4. `npx cap sync`
5. `npx cap open android` (Android Studio)
6. `npx cap open ios` (macOS/Xcode)

Native builds require the Android SDK/Android Studio for Android and macOS/Xcode for iPhone. Those toolchains are not available in this build environment, so this ZIP contains the complete web app plus native packaging configuration rather than a falsely-claimed APK/IPA.
