package ru.aasmc.springpatternsstarter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoronaWrapper {
    private Object result;
    private boolean corona;
}
