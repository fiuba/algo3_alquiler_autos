Object subclass: #Agencia	instanceVariableNames: 'vehiculos'	classVariableNames: ''	package: 'AlquilerAutos-Herencia'!!Agencia methodsFor: 'registering'!registrar: unVehiculo
	| vehiculoExistente |
	vehiculoExistente := self encontrarVehiculoPorVehiculo: unVehiculo.
	vehiculoExistente ifNotNil: [ VehiculoDuplicado signal ].
	vehiculos add: unVehiculo! !!Agencia methodsFor: 'renting' stamp: 'DS 4/10/2026 18:32'!alquilar: unaPatenteStr dias: unosDias
	| vehiculo |
	vehiculo := self encontrarVehiculo: unaPatenteStr.
	^ vehiculo alquilar: unosDias! !!Agencia methodsFor: 'private' stamp: 'DS 4/10/2026 18:34'!encontrarVehiculo: unaPatenteStr
	vehiculos do: [ :v |
		(v tengoPatente: unaPatenteStr) ifTrue: [ ^ v ] ].
	VehiculoNoEncontrado signal! !!Agencia methodsFor: 'private' stamp: 'DS 4/10/2026 18:34'!encontrarVehiculoPorVehiculo: unVehiculo
	vehiculos do: [ :v |
		(v igualA: unVehiculo) ifTrue: [ ^ v ] ].
	^ nil! !!Agencia methodsFor: 'initialization'!initialize
	vehiculos := OrderedCollection new! !"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!Agencia class	instanceVariableNames: ''!!Agencia class methodsFor: 'instance creation'!new
	^ self basicNew initialize! !Object subclass: #CostoBase	instanceVariableNames: 'valor'	classVariableNames: 'CostoBasePorDefecto'	package: 'AlquilerAutos-Herencia'!!CostoBase methodsFor: 'operations'!multiplicar: unosDias
	^ unosDias * valor! !!CostoBase methodsFor: 'operations'!sumarCon: unNumero
	^ unNumero + valor! !!CostoBase methodsFor: 'initialization' stamp: 'DS 4/9/2026 13:59'!conValor: unValor	valor := unValor.	! !!CostoBase methodsFor: 'initialization' stamp: 'DS 4/9/2026 14:01'!initialize 	valor := 500.! !"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!CostoBase class	instanceVariableNames: ''!!CostoBase class methodsFor: 'instance creation' stamp: 'DS 4/9/2026 13:58'!conValor: unValor	|result|	result := self new.	result conValor: unValor.	^result.! !Object subclass: #TipoPlaza	instanceVariableNames: 'precioPlaza'	classVariableNames: ''	package: 'AlquilerAutos-Herencia'!!TipoPlaza methodsFor: 'renting' stamp: 'DS 4/9/2026 14:04'!alquilar: numeroPlazas
	^numeroPlazas * precioPlaza.! !TipoPlaza subclass: #PlazaBasica	instanceVariableNames: ''	classVariableNames: ''	package: 'AlquilerAutos-Herencia'!!PlazaBasica methodsFor: 'initialization' stamp: 'DS 4/9/2026 14:17'!initialize 	precioPlaza := 100.! !TipoPlaza subclass: #PlazaPremium	instanceVariableNames: ''	classVariableNames: ''	package: 'AlquilerAutos-Herencia'!!PlazaPremium methodsFor: 'initialization' stamp: 'DS 4/9/2026 14:17'!initialize 	precioPlaza := 150.! !Object subclass: #Vehiculo	instanceVariableNames: 'patente'	classVariableNames: ''	package: 'AlquilerAutos-Herencia'!!Vehiculo methodsFor: 'initialization' stamp: 'DS 4/9/2026 14:18'!conPatente: unaPatenteStr
	patente := unaPatenteStr! !!Vehiculo methodsFor: 'accessing'!patente
	^ patente! !!Vehiculo methodsFor: 'renting'!alquilar: unosDias
	self subclassResponsibility! !!Vehiculo methodsFor: 'testing' stamp: 'DS 4/10/2026 18:34'!tengoPatente: unaPatenteStr
	^ patente = unaPatenteStr! !!Vehiculo methodsFor: 'testing' stamp: 'DS 4/10/2026 18:34'!igualA: otroVehiculo
	^ patente = otroVehiculo patente! !"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!Vehiculo class	instanceVariableNames: ''!!Vehiculo class methodsFor: 'instance creation' stamp: 'DS 4/9/2026 14:18'!conPatente: unaPatenteStr
	^ self basicNew conPatente: unaPatenteStr! !Vehiculo subclass: #Auto	instanceVariableNames: 'numeroPlazas tipoPlazas costoBase'	classVariableNames: ''	package: 'AlquilerAutos-Herencia'!!Auto methodsFor: 'initialization' stamp: 'DS 4/9/2026 14:19'!conPatente: unaPatenteStr numeroPlazas: unNumeroPlazas tipoPlazas: unTipoPlazas
	super conPatente: unaPatenteStr.
	numeroPlazas := unNumeroPlazas.
	tipoPlazas := unTipoPlazas.
	costoBase := CostoBase new! !!Auto methodsFor: 'renting'!alquilar: unosDias
	^ (self precioBase: unosDias) + (tipoPlazas alquilar: numeroPlazas)! !!Auto methodsFor: 'private'!precioBase: unosDias
	^ costoBase multiplicar: unosDias! !"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!Auto class	instanceVariableNames: ''!!Auto class methodsFor: 'instance creation' stamp: 'DS 4/9/2026 14:19'!conPatente: unaPatenteStr numeroPlazas: unNumeroPlazas tipoPlazas: unTipoPlazas	|result|	result := self new. 	result 		conPatente: unaPatenteStr
		numeroPlazas: unNumeroPlazas
		tipoPlazas: unTipoPlazas.	^result.! !Vehiculo subclass: #Bus	instanceVariableNames: ''	classVariableNames: ''	package: 'AlquilerAutos-Herencia'!!Bus methodsFor: 'renting'!alquilar: unosDias
	^ (1500 * unosDias) + 500! !"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!Bus class	instanceVariableNames: ''!!Bus class methodsFor: 'instance creation' stamp: 'DS 4/9/2026 14:18'!conPatente: unaPatenteStr
	^ self basicNew conPatente: unaPatenteStr! !Vehiculo subclass: #Camion	instanceVariableNames: 'pma costoBase'	classVariableNames: ''	package: 'AlquilerAutos-Herencia'!!Camion methodsFor: 'initialization' stamp: 'DS 4/9/2026 14:18'!conPatente: unaPatenteStr pma: unPma
	super conPatente: unaPatenteStr.
	pma := unPma.
	costoBase := CostoBase new! !!Camion methodsFor: 'private'!precioBase: unosDias
	^ costoBase multiplicar: unosDias! !!Camion methodsFor: 'renting'!alquilar: unosDias
	^ (self precioBase: unosDias) + (300 * pma)! !"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!Camion class	instanceVariableNames: ''!!Camion class methodsFor: 'instance creation' stamp: 'DS 4/9/2026 14:18'!conPatente: unaPatenteStr pma: unPma
	^ self basicNew conPatente: unaPatenteStr pma: unPma! !Error subclass: #VehiculoDuplicado	instanceVariableNames: ''	classVariableNames: ''	package: 'AlquilerAutos-Herencia'!Error subclass: #VehiculoNoEncontrado	instanceVariableNames: ''	classVariableNames: ''	package: 'AlquilerAutos-Herencia'!