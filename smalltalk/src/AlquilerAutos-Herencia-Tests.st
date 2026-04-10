TestCase subclass: #AlquilerVehiculosHerenciaTest	instanceVariableNames: ''	classVariableNames: ''	package: 'AlquilerAutos-Herencia-Tests'!!AlquilerVehiculosHerenciaTest methodsFor: 'tests' stamp: 'DS 4/10/2026 18:32'!testRegistroBMWElCostoDeAlquilerPor5DiasEsX
	| agencia valor |
	agencia := Agencia new.
	agencia registrar: (Auto conPatente: 'abc-123' numeroPlazas: 4 tipoPlazas: PlazaPremium new).
	valor := agencia alquilar: 'abc-123' dias: 5.
	self assert: valor equals: 3100! !!AlquilerVehiculosHerenciaTest methodsFor: 'tests' stamp: 'DS 4/10/2026 18:32'!testRegistroCherryQQElCostoDeAlquilerPor1DiaEs900
	| agencia valor |
	agencia := Agencia new.
	agencia registrar: (Auto conPatente: 'abc-123' numeroPlazas: 4 tipoPlazas: PlazaBasica new).
	valor := agencia alquilar: 'abc-123' dias: 1.
	self assert: valor equals: 900! !!AlquilerVehiculosHerenciaTest methodsFor: 'tests' stamp: 'DS 4/10/2026 18:32'!testRegistroBus
	| agencia valor |
	agencia := Agencia new.
	agencia registrar: (Bus conPatente: 'abc-123').
	valor := agencia alquilar: 'abc-123' dias: 1.
	self assert: valor equals: 2000! !!AlquilerVehiculosHerenciaTest methodsFor: 'tests' stamp: 'DS 4/10/2026 18:32'!testRegistroCargaElCostoDeAlquilerPor1DiaEs2000
	| agencia valor |
	agencia := Agencia new.
	agencia registrar: (Camion conPatente: 'abc-123' pma: 5).
	valor := agencia alquilar: 'abc-123' dias: 1.
	self assert: valor equals: 2000! !