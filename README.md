# mlb_api

## introduction
This is mlb API that return mlb players data based on 2023 hitting.
this data also include pitcher.

## Usage
this is base url for api.
```bash
https://mlb-api.onrender.com/api/v1/player
```

```bash
# return player who's position is DH
https://mlb-api.onrender.com/api/v1/player?position=DH

# return player who have hit more than 30 homerun
https://mlb-api.onrender.com/api/v1/player?homerun=30

# return player who have hit homerun more 20 and position is SS
https://mlb-api.onrender.com/api/v1/player?position=SS&homerun=30

# return player who belong to LAD and have hit more than 20 homerun
https://mlb-api.onrender.com/api/v1/player?team=LAD&homerun=20
```
## List of filter
```bash
team
position
gamePlayed
hit
doubleHit
tripleHit
homerun
AVG
OPS
```
