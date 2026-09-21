# SXAR Radio

SXAR v7 adds a Live Radio section.

## Features
- Featured live stations
- Play/pause radio
- Stop radio
- Current station display
- Add a custom station using its direct stream URL
- Radio can coexist with the normal music player

## Important streaming note
A radio URL must normally be a direct audio stream (for example MP3/AAC/HLS depending on browser support), not a normal station website URL. Some stations prevent browser playback through CORS or use formats that a browser cannot play directly.

For a production SXAR release, maintain a verified station directory and station metadata in the cloud backend. Respect each broadcaster's licensing, stream terms and branding requirements.
