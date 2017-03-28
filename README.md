# Services 
  # Core
    # SeasonTournamet 
     # request : /seasontournament/
        # find All
          # request: /
          # response: 
           {
             "length": 4,
             "results":    [
                 {
                   "id": 1,
                   "seasonId": 1,
                   "tournamentId": 1,
                   "name": "Tests"
                },
                      {
                   "id": 2,
                   "seasonId": 1,
                   "tournamentId": 1,
                   "name": "testick"
                },
                      {
                   "id": 3,
                   "seasonId": 1,
                   "tournamentId": 1,
                   "name": "Tests2"
                },
                      {
                   "id": 4,
                   "seasonId": 1,
                   "tournamentId": 1,
                   "logo":          {
                      "id": 69,
                      "path": "cesta1"
                   },
                   "name": "novyNazov"
                }
             ]
          }

    # find one
      # request: /{id}
      # response:
        {
           "id": 4,
           "seasonId": 1,
           "tournamentId": 1,
           "logo":    {
              "id": 69,
              "path": "cesta1"
           },
           "name": "novyNazov"
        }
        
        
      # create
        # request: /
           {
             "seasonId": 1,
             "tournamentId": 1,
             "logo":    {
                "data": "VmFuMmFqejQ5NThwdA==",
                "mimeType": "jpeg"
             },
             "name": "nameee"
          }

        # response:
           {
             "id": 18,
             "seasonId": 1,
             "tournamentId": 1,
             "logo":    {
                "id": 753,
                "path": "C:\\Users\\peter\\Documents\\Timak_master\\target\\resources\\d1f531cb-bfbe-41cc-b16b-d172dec6fba4.jpeg"
             },
             "name": "nameee"
          }

     # edit
      # request : /update/
         {
             "id": 18,
             "seasonId": 1,
             "tournamentId": 1,
             "logo":    {
                "id": 753,
                "path": "C:\\Users\\peter\\Documents\\Timak_master\\target\\resources\\d1f531cb-bfbe-41cc-b16b-d172dec6fba4.jpeg"
             },
             "name": "new Name"
          }

       # response:
         if success same like request

    # delete
      # request: /{id}
      # response: if success same like find All operations result without deleted season tournament


