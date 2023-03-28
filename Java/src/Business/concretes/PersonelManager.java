package Business.concretes;

import Business.abstracts.PersonelService;
import Core.Utilities.Results.DataResult;
import Core.Utilities.Results.Result;
import Entity.Concretes.Personel;

import java.util.List;

public class PersonelManager implements PersonelService {
    @Override
    public DataResult<List<Personel>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<Personel>> getAllSorted() {
        return null;
    }

    @Override
    public DataResult<List<Personel>> getAll(int id) {
        return null;
    }

    @Override
    public Result Add(Personel personel) {
        return null;
    }
}
