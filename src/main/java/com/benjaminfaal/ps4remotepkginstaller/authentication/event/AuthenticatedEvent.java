package com.benjaminfaal.ps4remotepkginstaller.authentication.event;

import com.benjaminfaal.ps4remotecontrol.ddp.model.Console;
import lombok.Data;

@Data
public class AuthenticatedEvent {

    private final Console console;

}