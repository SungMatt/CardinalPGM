package in.twizmwaz.cardinal.module.modules.filter.type.constant;

import in.twizmwaz.cardinal.module.modules.filter.FilterModule;
import in.twizmwaz.cardinal.module.modules.filter.FilterState;
import org.bukkit.event.Event;

public class AllEventFilter extends FilterModule {

    protected final boolean allow;

    public AllEventFilter(final String name, final boolean allow) {
        super(name);
        this.allow = allow;
    }

    @Override
    public FilterState evaluate(Event event) {
        return allow ? FilterState.ALLOW : FilterState.DENY;
    }

}
