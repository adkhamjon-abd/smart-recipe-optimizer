import sys
import json

input_data = sys.stdin.read()
request = json.loads(input_data)

response = {
    "optimizedIngredients": ["chickpeas", "oats"],
    "amounts": [100, 50],
    "score": {
        "protein": 30,
        "fat": 10,
        "calories": 450
    },
    "recommendations": [
        "Added chickpeas to increase protein",
        "Reduced oil to lower fat"
    ]
}

print(json.dumps(response))
