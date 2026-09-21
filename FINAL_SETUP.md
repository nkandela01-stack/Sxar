# SXAR — Final Android Build & Cloud Setup

## 1. Install prerequisites
- Android Studio: https://developer.android.com/studio
- Node.js LTS: https://nodejs.org/

## 2. Build the Android project
From the SXAR folder:

```bash
npm install
npx cap add android
npx cap sync android
npx cap open android
```

In Android Studio wait for Gradle sync, select a phone/emulator, then press Run.

To make an APK: **Build → Generate App Bundles or APKs → Generate APKs**.

## 3. Turn on cloud accounts
Create a Supabase project. Run `supabase_schema.sql` in Supabase SQL Editor. Create the `sxar-audio` and `sxar-covers` storage buckets as described in `CLOUD_SETUP.md`.

Then edit `cloud-config.example.js` and replace the two `YOUR_...` placeholders with the Supabase Project URL and public anon key. Never use the service-role key in the app.

## 4. Current production foundation
- Android Capacitor project configuration
- PWA/web app
- Music player and local library
- Artist uploads and lyrics
- Radio directory and favorites
- Search and navigation
- Account login/signup UI with Supabase Auth integration
- Listener/Artist role metadata
- Cloud-ready Supabase schema and storage plan
- Premium section foundation

## 5. Important publishing step
Before public release, configure a real domain, Supabase storage policies, app signing/keystore, privacy policy, music licensing/rights workflow, and Google Play Console listing.
