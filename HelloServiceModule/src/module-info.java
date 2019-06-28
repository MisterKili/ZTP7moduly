module HelloServiceModule {
    exports service;
    provides service.HelloInterface with service.HelloS;
}