Investigacion CDI
1. @Dependent:
Definición: El contexto predeterminado para los beans en CDI.
Comportamiento: Una instancia de un bean @Dependent se crea cuando se inyecta por primera vez y se destruye cuando ya no es necesario o cuando se destruye el bean que lo inyectó. El alcance de un bean @Dependent es específico de la inyección, lo que significa que cada inyección produce una nueva instancia.
Uso: Se utiliza para beans sin estado que no necesitan mantener datos entre solicitudes o sesiones. Por ejemplo, beans que realizan cálculos simples o recuperan datos de una base de datos.
2. @RequestScoped:
Definición: Vincula una instancia de un bean al ciclo de vida de una solicitud HTTP.
Comportamiento: Una nueva instancia de un bean @RequestScoped se crea al inicio de cada solicitud HTTP y se destruye al finalizar la solicitud. El alcance de un bean @RequestScoped es específico de la solicitud, lo que significa que todas las partes de la solicitud comparten la misma instancia.
Uso: Se utiliza para beans que necesitan mantener datos específicos de la solicitud, como los datos del formulario o los resultados de la validación.
3. @SessionScoped:
Definición: Vincula una instancia de un bean a la sesión HTTP actual.
Comportamiento: Una nueva instancia de un bean @SessionScoped se crea al iniciar la primera sesión HTTP y se mantiene durante toda la sesión. El alcance de un bean @SessionScoped es específico de la sesión, lo que significa que todas las solicitudes dentro de la misma sesión comparten la misma instancia.
Uso: Se utiliza para beans que necesitan mantener datos que persisten entre solicitudes dentro de la misma sesión, como el carrito de compras o la información del usuario autenticado.
4. @ConversationScoped:
Definición: Vincula una instancia de un bean a una conversación de usuario específica.
Comportamiento: Una nueva instancia de un bean @ConversationScoped se crea al iniciar una conversación y se destruye al finalizar la conversación. El alcance de un bean @ConversationScoped es específico de la conversación, lo que significa que todas las partes de la conversación comparten la misma instancia.
Uso: Se utiliza para beans que necesitan mantener datos relacionados con una interacción específica del usuario, como los pasos de un formulario de varias páginas o el historial de navegación.



5. @ApplicationScoped:
Definición: Crea una única instancia de un bean que se comparte en toda la aplicación.
Comportamiento: Una nueva instancia de un bean @ApplicationScoped se crea al iniciar la aplicación y se mantiene durante toda la vida útil de la aplicación. El alcance de un bean @ApplicationScoped es específico de la aplicación, lo que significa que todas las partes de la aplicación comparten la misma instancia.
Uso: Se utiliza para beans que representan recursos singletons de la aplicación, como configuraciones globales o servicios de acceso a datos compartidos.
