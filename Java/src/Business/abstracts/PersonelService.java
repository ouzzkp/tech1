package Business.abstracts;

import Core.Utilities.Results.DataResult;
import Core.Utilities.Results.Result;
import Entity.Concretes.Personel;

import java.util.List;

public interface PersonelService {
    DataResult<List<Personel>> getAll();
    DataResult<List<Personel>> getAllSorted();
    DataResult<List<Personel>> getAll(int id);
    Result Add(Personel personel);


}
