# SXAR v5 — Cloud-ready + Lyrics

This prototype adds:
- Lyrics screen and lyrics button in the player
- Per-track lyrics stored with uploads
- Artist upload form now accepts lyrics
- Lyrics accessible from Library/Search/Player
- Existing IndexedDB audio/artwork storage retained
- Cloud backend configuration placeholder

## Cloud architecture
The frontend is prepared for a real backend, but no live cloud account/credentials are embedded in this ZIP.
A production SXAR backend should provide authentication, a database for track metadata, object storage for audio/artwork, secure artist ownership rules, and streaming/CDN URLs.

IndexedDB is appropriate for the prototype because browsers can store structured data including audio/image Blobs, but it is origin-local rather than a shared server database. See MDN: https://developer.mozilla.org/en-US/docs/Web/API/IndexedDB_API

## Suggested production stack
Supabase (Auth + Postgres + Storage) or Firebase (Auth + Firestore + Storage).
Once project credentials are supplied, the placeholder cloud-config.example.js can be connected.
