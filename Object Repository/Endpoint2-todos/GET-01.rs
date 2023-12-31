<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET-01</name>
   <tag></tag>
   <elementGuidId>1376f16d-6aad-4962-975a-4bb38a0c965f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <katalonVersion>8.6.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://jsonplaceholder.typicode.com/todos</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

WS.verifyElementPropertyValue(response, '[1].userId', '1')
WS.verifyElementPropertyValue(response, '[1].id', '2')
WS.verifyElementPropertyValue(response, '[1].title', 'quis ut nam facilis et officia qui')
WS.verifyElementPropertyValue(response, '[1].completed', 'false')
WS.verifyElementPropertyValue(response, '[2].userId', '1')
WS.verifyElementPropertyValue(response, '[2].id', '3')
WS.verifyElementPropertyValue(response, '[2].title', 'fugiat veniam minus')
WS.verifyElementPropertyValue(response, '[2].completed', 'false')
WS.verifyElementPropertyValue(response, '[3].userId', '1')
WS.verifyElementPropertyValue(response, '[3].id', '4')
WS.verifyElementPropertyValue(response, '[3].title', 'et porro tempora')
WS.verifyElementPropertyValue(response, '[3].completed', 'true')
WS.verifyElementPropertyValue(response, '[4].userId', '1')
WS.verifyElementPropertyValue(response, '[4].id', '5')
WS.verifyElementPropertyValue(response, '[4].title', 'laboriosam mollitia et enim quasi adipisci quia provident illum')
WS.verifyElementPropertyValue(response, '[4].completed', 'false')
WS.verifyElementPropertyValue(response, '[5].userId', '1')
WS.verifyElementPropertyValue(response, '[5].id', '6')
WS.verifyElementPropertyValue(response, '[5].title', 'qui ullam ratione quibusdam voluptatem quia omnis')
WS.verifyElementPropertyValue(response, '[5].completed', 'false')
WS.verifyElementPropertyValue(response, '[6].userId', '1')
WS.verifyElementPropertyValue(response, '[6].id', '7')
WS.verifyElementPropertyValue(response, '[6].title', 'illo expedita consequatur quia in')
WS.verifyElementPropertyValue(response, '[6].completed', 'false')

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
