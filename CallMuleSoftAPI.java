Http http = new Http();

HttpRequest request = new HttpRequest();
request.setEndpoint('PUT-YOUR-API-URI');
request.setMethod('GET');

HttpResponse response = http.send(request);
// Deserializes the JSON string into collections of primitive data types.
Map<String, Object> results = (Map<String, Object>) JSON.deserializeUntyped(response.getBody());
Map<String, Object> rates = (Map<String, Object>) results.get('rates');
Map<String, Object> eur = (Map<String, Object>) rates.get('EURGBP');

// log value into the DEBUG
System.debug(eur.get('rate'));