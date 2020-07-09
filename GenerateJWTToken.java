Auth.JWT jwt = new Auth.JWT();
jwt.setSub('integration@salesfroce.com');
jwt.setAud('api.patrykbandurski.com');

Map<String, Object> claims = new Map<String, Object>();
claims.put('client_id', 'fdc5b21bfb8f4af89900b11db3b9eb59');

jwt.setAdditionalClaims(claims);

Auth.JWS jws = new Auth.JWS(jwt, 'MuleSoftJWT');

String token = jws.getCompactSerialization();
System.debug(token);