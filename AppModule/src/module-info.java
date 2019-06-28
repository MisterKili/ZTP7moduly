module AppModule {
    requires HelloModule;

    requires HelloServiceModule;
    uses service.HelloInterface;
}