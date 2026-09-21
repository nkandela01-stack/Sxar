
# SXAR — Real Cloud Backend Setup

This v6 package is prepared for a real Supabase backend.

## 1. Create the Supabase project
Create a Supabase project and copy its Project URL and anon/public key.

## 2. Run the database schema
Open Supabase SQL Editor and run `supabase_schema.sql`.

## 3. Create storage buckets
Create two storage buckets:
- `sxar-audio`
- `sxar-covers`

For a public streaming prototype, the buckets can be public. For a commercial release, use authenticated policies/signed URLs where appropriate.

## 4. Connect the web app
Copy `supabase_client.example.js` to `supabase_client.js` and insert the project URL and anon key.

## 5. Authentication
Enable Email/Password authentication in Supabase. Google/Apple sign-in can be added later.

## 6. Production flow
Artist:
Sign up → choose Artist → upload audio → upload cover → enter metadata + lyrics → save track.

Listener:
Sign in → browse SXAR → play track → view lyrics → play events recorded.

## Important
The ZIP does not contain a real Supabase secret or project credential. Those must belong to the SXAR project owner.
